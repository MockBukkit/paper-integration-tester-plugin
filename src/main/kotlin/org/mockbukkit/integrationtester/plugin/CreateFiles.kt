package org.mockbukkit.integrationtester.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.tasks.TaskAction
import java.io.File

abstract class CreateFiles : DefaultTask() {

    abstract val jarDirectory: DirectoryProperty


    @TaskAction
    fun action() {
        if (jarDirectory.isPresent) {
            jarDirectory.asFileTree.forEach { file: File ->
                file.copyTo(File.createTempFile("temp" + file.name, ".jar"))
            }
            return
        }

    }
}
