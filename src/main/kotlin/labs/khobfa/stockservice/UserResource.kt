package labs.khobfa.stockservice

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserResource {
    @GetMapping
    fun getUsers(): Flow<User> {
        return flow {
            emit(User("Rhyan"))
            emit(User("Rhyan"))
            emit(User("Rhyan"))
            emit(User("Rhyan"))
            emit(User("Rhyan"))
        }
    }
}

data class User(val name: String)