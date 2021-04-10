package com.auth.dbauth.server.dto;

import java.util.List;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleDto {

  private Integer serialNumber;
  private String username;
  private List<String> roleList;
  
  @NotBlank
  private String fullName;
}
