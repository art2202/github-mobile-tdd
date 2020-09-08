package com.example.githubmobile.ui

import androidx.test.ext.junit.runners.AndroidJUnit4
import io.reactivex.observers.TestObserver
import org.apache.maven.artifact.ant.RemoteRepository
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GitRepositoryTest {

    fun carregarListaDeRepositoriosPorNomeUserTest() {
        val repository = GitRepository()

        val testSubscriber = TestObserver<List<GitRepoDataResponse>>()
        repository.carregarListaDeRepositoriosPorNome().subscribe(testSubscriber)
        testSubscriber.assertNoErrors()

        val awaitTerminalEvent = testSubscriber.awaitTerminalEvent()
        for (item in (testSubscriber.events[0][0] as List<GitRepoDataResponse>)) {
            Assert.assertNotNull(item.id)
            Assert.assertNotNull(item.nome)
            Assert.assertNotNull(item.descricao)
            Assert.assertNotNull(item.userData)
            Assert.assertNotNull(item.userData.nome)
            Assert.assertNotNull(item.userData.imageurl)
        }
    }

}