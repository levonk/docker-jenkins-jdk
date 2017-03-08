import jenkins.model.*
import hudson.tasks.*

def instance = Jenkins.getInstance()
def mvnDescriptor = instance.getDescriptor(Maven)
mvnDescriptor.setInstallations(
        new Maven.MavenInstallation("3.3.9", "/opt/apache-maven-3.3.9"),
        new Maven.MavenInstallation("3.2.5", "/opt/apache-maven-3.2.5"),
        new Maven.MavenInstallation("3.1.1", "/opt/apache-maven-3.1.1")
        new Maven.MavenInstallation("3.0.5", "/opt/apache-maven-3.0.5")
)

instance.save()
