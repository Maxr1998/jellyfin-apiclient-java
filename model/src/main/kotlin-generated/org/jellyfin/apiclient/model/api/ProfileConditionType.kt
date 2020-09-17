// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ProfileConditionType {
	@SerialName("Equals")
	EQUALS,

	@SerialName("NotEquals")
	NOT_EQUALS,

	@SerialName("LessThanEqual")
	LESS_THAN_EQUAL,

	@SerialName("GreaterThanEqual")
	GREATER_THAN_EQUAL,

	@SerialName("EqualsAny")
	EQUALS_ANY
}
