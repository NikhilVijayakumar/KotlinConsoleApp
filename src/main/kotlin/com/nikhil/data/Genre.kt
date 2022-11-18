package com.nikhil.data

sealed class Genre {

    sealed class Fiction : Genre() {
        object Classics : Fiction()
        object Fantasy : Fiction()
        object ScienceFiction : Fiction()
    }

    sealed class NonFiction : Genre() {
        object Biography : NonFiction()
        object Business : NonFiction()
        object Feminism : NonFiction()
        object Politics : NonFiction()
        object SelfHelp : NonFiction()
    }

    override fun toString(): String {
        return this::javaClass.get().simpleName
    }
}