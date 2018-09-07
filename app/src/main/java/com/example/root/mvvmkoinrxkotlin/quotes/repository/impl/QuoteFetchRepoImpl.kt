package com.example.root.mvvmkoinrxkotlin.quotes.repository.impl

import com.example.root.mvvmkoinrxkotlin.quotes.repository.repo.QuoteFetchRepo
import io.reactivex.Single
import java.util.*

/**
 * Created by Akash Saggu(R4X) on 7/9/18 at 10:50.
 * akashsaggu@protonmail.com
 * @Version 1 (7/9/18)
 * @Updated on 7/9/18
 */
class QuoteFetchRepoImpl : QuoteFetchRepo {
    private val quotes by lazy {
        arrayListOf("I love you the more in that I believe you had liked me for my own sake and for nothing else.",
                " But man is not made for defeat. A man can be destroyed but not defeated.",
                "When you reach the end of your rope, tie a knot in it and hang on.",
                "There is nothing permanent except change.",
                "You cannot shake hands with a clenched fist.",
                "Let us sacrifice our today so that our children can have a better tomorrow.",
                "The most difficult thing is the decision to act, the rest is merely tenacity. The fears are paper tigers. You can do anything you decide to do. You can act to change and control your life; and the procedure, the process is its own reward.",
                "Do not mind anything that anyone tells you about anyone else. Judge everyone and everything for yourself.",
                "Learning never exhausts the mind.",
                "There is no charm equal to tenderness of heart.",
                "All that we see or seem is but a dream within a dream.",
                "Lord, make me an instrument of thy peace. Where there is hatred, let me sow love.",
                "If you cannot do great things, do small things in a great way. ",
                "Permanence, perseverance and persistence in spite of all obstacles, discouragements, and impossibilities: It is this, that in all things distinguishes the strong soul from the weak.",
                "Independence is happiness.",
                "The supreme art of war is to subdue the enemy without fighting.",
                "Keep your face always toward the sunshine - and shadows will fall behind you.",
                "Happiness can exist only in acceptance.")
    }

    override fun fetchQuote(): Single<String> {
        return Single.just(
                getRandomQuotes()
        )
    }


    private fun getRandomQuotes(): String {
        return quotes.random()!!
    }

    private fun <E> List<E>.random(): E? = if (size > 0) get(Random().nextInt(size)) else null
}