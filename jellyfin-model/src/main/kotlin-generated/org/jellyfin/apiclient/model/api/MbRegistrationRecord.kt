// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(LocalDateTimeSerializer::class)

package org.jellyfin.apiclient.model.api

import java.time.LocalDateTime
import kotlin.Boolean
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.serializer.LocalDateTimeSerializer

/**
 * MB Registration Record.
 */
@Serializable
data class MbRegistrationRecord(
	/**
	 * Gets or sets expiration date.
	 */
	@SerialName("ExpirationDate")
	val expirationDate: LocalDateTime,
	/**
	 * Gets or sets a value indicating whether is registered.
	 */
	@SerialName("IsRegistered")
	val isRegistered: Boolean,
	/**
	 * Gets or sets a value indicating whether reg checked.
	 */
	@SerialName("RegChecked")
	val regChecked: Boolean,
	/**
	 * Gets or sets a value indicating whether reg error.
	 */
	@SerialName("RegError")
	val regError: Boolean,
	/**
	 * Gets or sets a value indicating whether trial version.
	 */
	@SerialName("TrialVersion")
	val trialVersion: Boolean,
	/**
	 * Gets or sets a value indicating whether is valid.
	 */
	@SerialName("IsValid")
	val isValid: Boolean
)