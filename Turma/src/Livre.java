import java.time.DayOfWeek;

public class Livre extends Turma {

	public Livre(int nivel, DayOfWeek d, Turma.Periodo p) {
		super(nivel, d, p);
	}

	@Override
	public void printRelatorio() {
		System.out.printf("C�digo da turma: %s \n", this.nivel + "L");
		organizaAluno();
		printAlunos();
	}

	@Override
	public void printAlunos() {
		for (Aluno a : alunos) {
			System.out.println(a.getNome() + " " + a.alunoAprovLivre());
		}
	}

	@Override
	public boolean cadastrarAluno(Aluno a) {
		boolean cadastrado = a.setT(this);

		if (cadastrado == true) {
			alunos.add(a);
			return true;
		} else {
			System.out.println("Aluno j� cadastrado.");
			return false;
		}

	}
}
