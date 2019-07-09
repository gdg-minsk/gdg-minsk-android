package com.gdg.domain.constant

import android.support.annotation.IntDef

class Constants {


    @IntDef(
        MeetupType.DEFAULT,
        MeetupType.SPEACH,
        MeetupType.WORKSHOP
        )
    @Retention(AnnotationRetention.SOURCE)
    annotation class MeetupType {
        companion object {

            const val DEFAULT = 0
            const val SPEACH = 1
            const val WORKSHOP = 2

        }
    }


    @IntDef(
        Label.DEFAULT,
        Label.ANDROID,
        Label.KOTLIN
    )
    @Retention(AnnotationRetention.SOURCE)
    annotation class Label {
        companion object {

            const val DEFAULT = 0
            const val ANDROID = 1
            const val KOTLIN = 2

        }
    }






}