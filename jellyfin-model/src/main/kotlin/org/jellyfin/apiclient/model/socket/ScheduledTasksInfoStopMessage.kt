package org.jellyfin.apiclient.model.socket

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("ScheduledTasksInfoStop")
public class ScheduledTasksInfoStopMessage : OutgoingSocketMessage
