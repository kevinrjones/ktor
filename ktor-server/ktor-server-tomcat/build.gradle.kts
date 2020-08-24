description = ""

kotlin.sourceSets {
    jvmMain {
        dependencies {
            api(project(":ktor-server:ktor-server-host-common"))
            api(project(":ktor-server:ktor-server-servlet"))
            api("org.apache.tomcat:tomcat-catalina:$tomcat_version")
            api("org.apache.tomcat.embed:tomcat-embed-core:$tomcat_version")
        }
    }
    jvmTest {
        dependencies {
            api(project(":ktor-server:ktor-server-test-host"))
            api(project(":ktor-server:ktor-server-core"))
            api(project(":ktor-server:ktor-server-core", configuration = "testOutput"))
        }
    }
}