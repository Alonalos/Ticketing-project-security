package com.cybertek.implementation;

import com.cybertek.entity.User;
import com.cybertek.entity.common.UserPrincipal;
import com.cybertek.repository.UserRepository;
import com.cybertek.service.SecurityService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceimpl implements SecurityService {
    private UserRepository userRepository;

    public SecurityServiceimpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user=userRepository.findByUserName(s);
        if(user==null){
            throw new UsernameNotFoundException("This user does not exist");
        }


        return new UserPrincipal(user);
    }
}
