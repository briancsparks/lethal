package com.github.briancsparks.lethal.services

import com.github.briancsparks.lethal.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
