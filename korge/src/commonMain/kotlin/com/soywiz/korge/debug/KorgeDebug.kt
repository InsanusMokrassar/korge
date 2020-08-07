package com.soywiz.korge.debug

import com.soywiz.korge.view.*
import com.soywiz.korui.*

interface KorgeDebugNode {
    fun getDebugProperties(views: Views): EditableNode?
    fun getDebugComponent(views: Views): UiComponent? = null
}
