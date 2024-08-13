package JPOP.Presentation.Mappers;



import JPOP.Presentation.Dtos.UserDto;
import JPOP.Presentation.Models.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface Userdtomapper {
    Userdtomapper userdtomapper = Mappers.getMapper(Userdtomapper.class);
    @Mapping(target = "email",ignore = true)
    UserDto mapToUserDto(User user);
    User mapToUser(UserDto userDto);
}
