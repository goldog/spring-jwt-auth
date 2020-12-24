package com.mctak.springjwtauth.payload.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse {
    private final String type = "Bearer";
    private String token;
    private Long id;
	private String username;
	private String email;
	private List<String> roles;
    
}
