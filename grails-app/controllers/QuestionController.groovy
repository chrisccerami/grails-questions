/**
 * Created by chriscerami on 4/19/15.
 */
class QuestionController {
    def show() {
        [question: Question.find("where id = ?", params.id)]
    }

    def index() {
        [questions: Question.findAll()]
    }

    def newQuestion() {
        [question: new Question()]
    }

    def create() {
        def question = new Question(title: params.title,
                                    body: params.body,
                                    asker: params.asker)
        redirect(action: "show", params: [id: question.id])
    }
}
