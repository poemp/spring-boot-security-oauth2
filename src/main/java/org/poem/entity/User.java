package org.poem.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Collection;

public class User implements UserDetails {

    private Long id;

    private String name;

    private int age;

    private String salary;

    private String password;


    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String getPassword() {
        return new BCryptPasswordEncoder( ).encode(password);
    }

    @Override
    public String getUsername() {
        return this.name;
    }


    //以上属性通常是自定义实体类User定义的
    //以下属性是User实现UserDetails接口必须的

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return java.util.Arrays.asList(new SimpleGrantedAuthority("USER"),
                new SimpleGrantedAuthority("ADMIN"));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;    //默认账户未过期
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;    //默认用户未被锁定
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;    //默认证书未过期
    }

    @Override
    public boolean isEnabled() {
        return true;    //默认有效，即用户未被停用
    }
}
