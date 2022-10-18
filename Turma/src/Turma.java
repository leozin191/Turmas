import java.time.DayOfWeek;
import java.util.ArrayList;

public class Turma {

	public Turma(int nivel, DayOfWeek d, Periodo p) {
		this.nivel = nivel;
		this.d = d;
		this.p = p;
	}

	public int getCodPeriodo() {
		if (this.p == Periodo.manha) {
			return 1;
		} else if (this.p == Periodo.tarde) {
			return 2;
		} else if (this.p == Periodo.noite) {
			return 3;
		}
		return -1;
	}

	public String getCodTurma() {
		String cod = "";
		cod += this.nivel;
		cod += this.d.getValue();
		cod += this.getCodPeriodo();
		return cod;
	}

	public enum Periodo {
		manha, tarde, noite;
	}

	protected int nivel;
	private DayOfWeek d;
	private Periodo p;

	public boolean cadastrarAluno(Aluno a) {
		if (alunos.size() < 20) {
			boolean cadastrado = a.setT(this);

			if (cadastrado == true) {
				alunos.add(a);
				return true;
			} else {
				System.out.println("Aluno já cadastrado.");
				return false;
			}

		}
		System.out.println("Turma cheia.");
		return false;
	}

	ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	public void diaProva() {
		for (Aluno a : alunos) {
			a.fazerAva();
		}
	}

	public double tirarMedNotas() {
		double media = 0;
		for (Aluno a : alunos) {
			media += a.verAprov();
		}
		media /= alunos.size();
		return media;
	}

	public double tirarMedFreq() {
		double media = 0;
		for (Aluno a : alunos) {
			media += a.verFreq();
		}
		media /= alunos.size();
		return media;
	}

	public void organizaAluno() {
		alunos.sort(null);
	}

	public void printAlunos() {
		for (Aluno a : alunos) {
			System.out.println(a);
		}
	}

	public Aluno getMelhorAluno() {
		Aluno melhor = alunos.get(0);
		for (Aluno a : alunos) {
			if (melhor.getDesempenho() < a.getDesempenho()) {
				melhor = a;
			}
		}
		return melhor;
	}

	public void printRelatorio() {
		System.out.printf("Código da turma: %s Média de notas da Livre: %.2f Média de Frequencia da Livre: %.2f \n",
				getCodTurma(), tirarMedNotas(), tirarMedFreq());
		System.out.println("Melhor Aluno: " + getMelhorAluno());
		organizaAluno();
		printAlunos();
	}

}
