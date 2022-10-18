import java.time.DayOfWeek;

public class Ead extends Turma {

	public Ead(int nivel, DayOfWeek d, Turma.Periodo p) {
		super(nivel, d, p);
	}

	@Override
	public void printRelatorio() {
		System.out.printf("Código da turma: %sE Média de notas EAD: %.2f \n", this.nivel, tirarMedNotas());
		System.out.println("Melhor Aluno: " + getMelhorAluno());
		organizaAluno();
		printAlunos();
	}

	@Override
	public Aluno getMelhorAluno() {
		Aluno melhor = alunos.get(0);
		for (Aluno a : alunos) {
			if (melhor.getDesempenhoEad() < a.getDesempenhoEad()) {
				melhor = a;
			}
		}
		return melhor;
	}

	@Override
	public boolean cadastrarAluno(Aluno a) {
		boolean cadastrado = a.setT(this);

		if (cadastrado == true) {
			alunos.add(a);
			return true;
		} else {
			System.out.println("Aluno já cadastrado.");
			return false;
		}

	}

}
