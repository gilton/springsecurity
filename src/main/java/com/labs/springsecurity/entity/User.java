package com.labs.springsecurity.entity;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User implements UserDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
	
	private String login;
    private String password;
    
    @Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singletonList(new SimpleGrantedAuthority("ADMIN"));
	}
	
	@Override
	public String getUsername() { return login; }
	
//	Booleans setted to true
	@Override
	public boolean isAccountNonExpired() { return true; }
	
	@Override
	public boolean isAccountNonLocked() { return true; }
	
	@Override
	public boolean isCredentialsNonExpired() { return true; }
	
	@Override
	public boolean isEnabled() { return true; }
}
