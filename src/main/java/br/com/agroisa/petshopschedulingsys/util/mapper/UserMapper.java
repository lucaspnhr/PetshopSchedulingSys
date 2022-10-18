package br.com.agroisa.petshopschedulingsys.util.mapper;

import br.com.agroisa.petshopschedulingsys.model.Client;
import br.com.agroisa.petshopschedulingsys.model.Employee;
import br.com.agroisa.petshopschedulingsys.model.User;
import br.com.agroisa.petshopschedulingsys.model.dto.UserDTO;
import br.com.agroisa.petshopschedulingsys.model.dto.UserRegisterDTO;
import br.com.agroisa.petshopschedulingsys.model.enums.UserRole;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserMapper {

    private final ModelMapper modelMapper;

    public UserDTO toDTO(User user){
        return modelMapper.map(user, UserDTO.class);
    }

    public <T extends User> T fromRegisterToUser(UserRegisterDTO dto, Class<T> clazz){
        return modelMapper.map(dto, clazz);
    }

    public <T extends User> T toUser(UserDTO dto, Class<T> clazz){
        return modelMapper.map(dto, clazz);
    }

}
