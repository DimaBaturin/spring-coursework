package com.sanity.nil.dto.response;

import com.sanity.nil.model.RoleType;
import lombok.Data;

/**
 * Data Transfer Object for Role response
 */
@Data
public class RoleResponse {

    private Long id;
    private RoleType type;
}
