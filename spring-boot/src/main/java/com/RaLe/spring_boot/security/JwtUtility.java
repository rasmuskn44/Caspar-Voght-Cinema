package com.RaLe.spring_boot.security;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import java.util.Date;

public class JwtUtility {
    private static final SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    //Usable for one hour
    private static long expiration = 1000 * 60 * 60;

    public static String generateToken(Long userId){
        return Jwts.builder()
                .setSubject(userId.toString())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public static Long extratUserId(String token){
        return Long.valueOf(getClaims(token).getSubject());
    }

    public static boolean isTokenExpired(String token){
        return getClaims(token).getExpiration().before(new Date());
    }

    private static Claims getClaims(String token){
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
