package com.orderflow.orderservice.domain;

/**
 * ORDER STATE ENUM
 * - Used an enum instead of raw Strings for type-safety and explitit states.
 * - When persisted with EnumType.String, the database stores readable values.
 * - Mirrors mental model used by APIs.
 * 
 * @author Emmanuel Taylor
 */
public enum OrderState {
    OPEN,
    COMPLETED,
    CANCELED,
    DRAFT
}
