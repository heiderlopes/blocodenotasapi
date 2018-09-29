package br.com.heiderlopes.blocodenotas.repository

import br.com.heiderlopes.blocodenotas.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository : MongoRepository<Nota, String> {

    fun findByTituloContainingIgnoreCase(titulo: String): List<Nota>


}