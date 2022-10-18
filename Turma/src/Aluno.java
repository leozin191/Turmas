import java.util.Random;
import java.util.Vector;

public class Aluno implements Comparable {

	public Aluno(int a, String nome) {
		this.matricula = a;
		this.nome = nome;
		this.t = null;
		this.frequencia = -1;

	}

	public boolean setT(Turma t) {
		if (this.t == null) {
			this.t = t;
			return true;
		} else {
			return false;
		}
	}

	private float frequencia;
	private String nome;
	private int matricula;
	private Turma t;
	private Vector<Integer> notas = new Vector<Integer>();

	public void fazerAva() {
		Random rand = new Random();
		int upperbound = 16;
		int int_random = rand.nextInt(upperbound) + 10;
		notas.add(int_random);
	}

	public double verFreq() {
		if (frequencia == -1) {
			Random rand = new Random();
			int upperbound = 101;
			for (int i = 0; i < 20; i++) {
				int int_random = rand.nextInt(upperbound);
				if (int_random > 10) {
					frequencia++;
				}
			}
			frequencia /= 20.0;
		}
		return frequencia;
	}

	public double verAprov() {
		double media = 0;
		for (Integer nota : notas) {
			media += nota;
		}
		return media;
	}

	public String alunoAprov() {
		if (this.getNotaTotal() > 60 && this.frequencia > 0.75) {
			return "Aluno Aprovado";
		}
		return "Aluno Reprovado";
	}

	public String alunoAprovLivre() {
		int visuAulas = 0;
		Random rand = new Random();
		int upperbound = 6;
		for (int i = 0; i <= 13; i++) {
			int int_random = rand.nextInt(upperbound);
			if (int_random > 1) {
				visuAulas++;
			}
		}
		if (visuAulas < 10) {
			return "Aluno Reprovado, Aulas Assistidas: " + visuAulas;
		}
		return "Aluno Aprovado";
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int compareTo(Object o) {
		return this.getNome().compareTo(((Aluno) o).getNome());
	}

	public double getNotaTotal() {
		double media = 0;
		for (Integer nota : notas) {
			media += nota;
		}
		return media;
	}

	@Override
	public String toString() {
		String str = "";
		str += nome;
		str += " ";
		str += "Nota Total: ";
		str += getNotaTotal();
		str += " ";
		str += alunoAprov();
		return str;
	}

	public double getDesempenho() {
		return 0.8 * getNotaTotal() + 0.2 * frequencia;
	}

	public double getDesempenhoEad() {
		return getNotaTotal();
	}

}
