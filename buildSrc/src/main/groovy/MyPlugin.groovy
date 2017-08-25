import com.github.zafarkhaja.semver.Version
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.artifacts.Configuration
import org.gradle.api.tasks.Copy

/**
 *
 *
 *
 * @author Baptiste Mesta
 */
class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
      if(Version.valueOf("7.2.0") <= Version.valueOf("7.3.0")){
          project.tasks.create(name: "task1")
      }
    }


}
