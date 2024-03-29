package com.cybertek.implementation;

import com.cybertek.dto.RoleDTO;
import com.cybertek.entity.Role;
import com.cybertek.mapper.RoleMapper;
import com.cybertek.repository.RoleRepository;
import com.cybertek.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceimpl implements RoleService {

    private RoleRepository roleRepository;

    private RoleMapper roleMapper;

    public RoleServiceimpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
        List<Role> list=roleRepository.findAll();
        return list.stream()
                .map(obj->{return roleMapper.convertToDTO(obj);})
                .collect(Collectors.toList());
    }

    @Override
    public RoleDTO findById(long id) {
        Role role=roleRepository.findById(id).get();
        return roleMapper.convertToDTO(role);
    }
}
