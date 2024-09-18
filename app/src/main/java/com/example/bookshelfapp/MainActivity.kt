package com.example.bookshelfapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.bookshelfapp.ui.BookShelfApp
import com.example.bookshelfapp.ui.theme.BookShelfAppTheme

/**
 *
 * Espera-se que o app faça o seguinte:
 *
 * - Faça uma solicitação para a API Google Books usando a Retrofit.
 * - Analise a resposta usando o Gson.
 * - Mostre imagens salvas dos livros de forma assíncrona em conjunto com os títulos em uma grade vertical.
 * - Use um repositório para implementar as práticas recomendadas, separando a interface e a camada de dados.
 * - Crie testes de código que exigem o serviço de rede usando a injeção de dependência.
 *
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BookShelfAppTheme {
                BookShelfApp()
            }
        }
    }
}