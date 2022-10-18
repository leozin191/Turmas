import java.time.DayOfWeek;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<Turma> turmas = new Vector<Turma>();
		turmas.add(new Livre(1, DayOfWeek.MONDAY, Ead.Periodo.manha));
		turmas.add(new Ead(2, DayOfWeek.TUESDAY, Ead.Periodo.tarde));
		turmas.add(new Livre(3, DayOfWeek.WEDNESDAY, Ead.Periodo.noite));
		turmas.add(new Ead(4, DayOfWeek.THURSDAY, Ead.Periodo.tarde));
		turmas.add(new Turma(5, DayOfWeek.FRIDAY, Ead.Periodo.manha));

		String[] nomes = { "Helena", "Alexsandro", "Alice", "Arthur", "Laura", "Heitor", "Manuela", "Bernardo",
				"Valentina", "Davi", "Sophia", "Théo", "Isabella", "Lorenzo", "Heloísa", "Gabriel", "Luiza", "Pedro",
				"Júlia", "Benjamin", "Lorena", "Matheus", "Lívia", "Lucas", "Maria", "Luiza", "Nicolas", "Cecília",
				"Joaquim", "Eloá", "Samuel", "Giovanna", "Henrique", "Maria", "Clara", "Rafael", "Maria", "Eduarda",
				"Guilherme", "Mariana", "Enzo", "Lara", "Murilo", "Beatriz", "Benício", "Antonella", "Gustavo", "Maria",
				"Júlia", "Isaac", "Emanuelly", "João", "Miguel", "Isadora", "Lucca", "Ana", "Clara", "Enzo", "Gabriel",
				"Melissa", "Pedro", "Henrique", "Ana G", "Luiza", "Felipe", "Ana F", "Júlia", "João", "Pedro", "Esther",
				"Pietro", "Lavínia", "Anthony", "Maitê", "Daniel", "Maria", "Cecília", "Bryan", "Maria", "Alice",
				"Davi", "Lucca", "Sarah", "Leonardo", "Elisa", "Vicente", "Liz", "Eduardo", "Yasmin", "Gael",
				"Isabelly", "Antônio", "Alícia", "Vitor", "Clara", "Noah", "Isis", "Caio", "Rebeca", "João", "Rafaela",
				"Emanuel", "Marina", "Cauã", "Ana", "Laura", "João Bosco", "Lucas", "Maria", "Helena", "Calebe",
				"Agatha", "Enrico", "Gabriela", "Vinícius", "Catarina", "Bento" };

		Vector<Aluno> alunos = new Vector<Aluno>();
		int i = 0;
		while (i < 117) {
			Aluno a = new Aluno(i, nomes[i]);
			a.verFreq();
			alunos.add(a);
			turmas.elementAt(i / 25).cadastrarAluno(a);
			i++;
		}
		for (Turma t : turmas) {
			t.diaProva();
			t.diaProva();
			t.diaProva();
			t.diaProva();
		}
		for (Turma t : turmas) {
			t.printRelatorio();
		}
	}
}
