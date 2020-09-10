plugins {
	kotlin("jvm")
	id("application")
}

application {
	mainClassName = "org.jellyfin.openapi.MainKt"
}

dependencies {
	implementation(Dependencies.Kotlin.stdlib)

	// Reading OpenAPI
	implementation(Dependencies.swaggerParser)

	// Kotlin code generation
	implementation(Dependencies.kotlinPoet)

	// Dependency Injection
	implementation(Dependencies.Koin.core)

	// Testing
	testImplementation(Dependencies.Kotlin.Test.junit)
}

task("generateSources", JavaExec::class) {
	main = application.mainClassName
	classpath = sourceSets.main.get().runtimeClasspath

	args = mapOf(
		"openApiFile" to file("../openapi.json"),
		"apiOutputDir" to file("../api/src/main/kotlin-generated"),
		"modelsOutputDir" to file("../model/src/main/kotlin-generated")
	).map { listOf("--${it.key}", it.value.toString()) }.flatten()
}
