package org.mockbukkit.integrationtester.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction

abstract class GradlePlugin : Plugin<Project> {

    @TaskAction
    override fun apply(project: Project) {
        project.tasks.register("createFileTaskFromBinaryPlugin", CreateFiles::class.java) {
            System.out.println("Created FileTaskFromBinaryPlugin")
        }
    }
}