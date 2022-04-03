package com.github.jackjonson.antdesignvueplugin.services

import com.intellij.openapi.project.Project
import com.github.jackjonson.antdesignvueplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
