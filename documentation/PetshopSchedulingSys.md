classDiagram
direction BT
class Client {
  + toString() String
}
class ClientRepository {
<<Interface>>

}
class ClippingSize {
<<enumeration>>
  + values() ClippingSize[]
  + valueOf(String) ClippingSize
}
class ClippingType {
<<enumeration>>
  + valueOf(String) ClippingType
  + values() ClippingType[]
}
class Employee
class EmployeeRepository {
<<Interface>>

}
class MainController {
  + getRegisterPage(Model) String
  + registerUser(UserRegisterDTO, Principal) String
  + getHomePage(Model, Principal) String
   String loginPage
}
class PasswordEncoder {
  + bCryptPasswordEncoder() BCryptPasswordEncoder
}
class Pet {
  - String name
  - Client client
   String name
   Client client
}
class PetId {
  + hashCode() int
  + equals(Object) boolean
  # canEqual(Object) boolean
}
class PetshopSchedulingSysApplication {
  + main(String[]) void
  + run(String[]) void
}
class PetshopSchedulingSysApplicationTests {
  ~ contextLoads() void
}
class Schedule {
  - LocalDateTime appoitment
  - Double price
  - Client client
  - Status status
   Double price
   Client client
   LocalDateTime appoitment
   Status status
}
class ScheduleId {
  + equals(Object) boolean
  + hashCode() int
  # canEqual(Object) boolean
}
class ScheduleService {
  - Service service
  - ClippingSize clippingSize
  - ClippingType clippingType
  - Schedule schedule
  - boolean withSisors
  - boolean withHairClipper
   boolean withHairClipper
   boolean withSisors
   Service service
   Schedule schedule
   ClippingType clippingType
   ClippingSize clippingSize
}
class ScheduleServiceId {
  + hashCode() int
  + equals(Object) boolean
  # canEqual(Object) boolean
}
class SecurityConfigurer {
  + filterChain(HttpSecurity) SecurityFilterChain
  + dbAuthenticationProvider() DaoAuthenticationProvider
}
class Service {
  - Double price
  - String name
   String name
   Double price
}
class Status {
<<enumeration>>
  + values() Status[]
  + valueOf(String) Status
}
class Telephone {
  - int id
  - String number
  - String ddd
   String number
   String ddd
   int id
}
class User {
  - String email
  - String firstname
  - Telephone telephone
  - String password
  - String lastname
  - UserRole userRole
  + hashCode() int
  + equals(Object) boolean
   String password
   boolean credentialsNonExpired
   boolean enabled
   String email
   boolean accountNonLocked
   String lastname
   boolean accountNonExpired
   Collection~GrantedAuthority~ authorities
   Telephone telephone
   String firstname
   UserRole userRole
   String username
}
class UserDTO
class UserMapper {
  + toUser(UserDTO, Class~T~) T
  + toDTO(User) UserDTO
  + fromRegisterToUser(UserRegisterDTO, Class~T~) T
}
class UserRegisterDTO {
  - String lastname
  - String firstname
  - Telephone telephone
  - String password
  - String email
   Telephone telephone
   String firstname
   String password
   String email
   String lastname
}
class UserRepository~T~ {
<<Interface>>
  + findByEmail(String) Optional~T~
}
class UserRole {
<<enumeration>>
  + values() UserRole[]
  + valueOf(String) UserRole
   String[] rolelist
}
class UserServiceImpl {
  + registerUser(User) void
  + loadUserByUsername(String) UserDetails
  + findUserByEmail(String) User
}
class WebConfig {
  + addViewControllers(ViewControllerRegistry) void
  ~ modelMapper() ModelMapper
}

Client  -->  User 
ClientRepository  -->  UserRepository~T~ 
Employee  -->  User 
EmployeeRepository  -->  UserRepository~T~ 
MainController "1" *--> "userMapper 1" UserMapper 
MainController "1" *--> "userService 1" UserServiceImpl 
Pet "1" *--> "client 1" Client 
PetId "1" *--> "client 1" Client 
Schedule "1" *--> "client 1" Client 
Schedule "1" *--> "status 1" Status 
ScheduleId "1" *--> "client 1" Client 
ScheduleService "1" *--> "clippingSize 1" ClippingSize 
ScheduleService "1" *--> "clippingType 1" ClippingType 
ScheduleService "1" *--> "schedule 1" Schedule 
ScheduleService "1" *--> "service 1" Service 
ScheduleServiceId "1" *--> "schedule 1" Schedule 
ScheduleServiceId "1" *--> "service 1" Service 
SecurityConfigurer "1" *--> "userDetailService 1" UserServiceImpl 
User "1" *--> "telephone 1" Telephone 
User "1" *--> "userRole 1" UserRole 
UserRegisterDTO "1" *--> "telephone 1" Telephone 
UserServiceImpl "1" *--> "clientRepository 1" ClientRepository 
UserServiceImpl "1" *--> "employeeRepository 1" EmployeeRepository 
