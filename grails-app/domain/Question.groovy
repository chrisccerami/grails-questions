import java.lang.invoke.SerializedLambda

/**
 * Created by chriscerami on 4/19/15.
 */
class Question {
    static mapping = {
        id generator: 'increment'
    }
    String title
    String body
    String asker
}
