package com.brahalla.Cerberus.model.factory;

import com.brahalla.Cerberus.domain.entity.User;
import com.brahalla.Cerberus.model.security.CerberusUser;

import org.springframework.security.core.authority.AuthorityUtils;

public class CerberusUserFactory {

  public static CerberusUser create(User user) {
    return new CerberusUser(
      user.getId(),
      user.getUsername(),
      user.getPassword(),
      AuthorityUtils.commaSeparatedStringToAuthorityList(user.getAuthorities())
    );
  }

}
