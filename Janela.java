import javax.swing.*;
import java.awt.*;
public class Janela extends JFrame {
    public Janela(){
        setTitle("Tarefas 2.0");
        setLocation(750, 300);
        setSize(500,300);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configuracaoTela();
        setVisible(true);
    }

    public void configuracaoTela(){
        JPanel panel = new JPanel();
        GroupLayout editJanela = new GroupLayout(panel);
        panel.setLayout(editJanela);
        editJanela.setAutoCreateContainerGaps(true);


        JLabel CaixaTarefa = new JLabel("Digite a tarefa.");
        JTextArea textBox = new JTextArea(10,8);
        textBox.setLayout(new BorderLayout(10,15));
        textBox.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        textBox.setLineWrap(true);

        JLabel NivelPrioridade = new JLabel("Qual o nivel de prioridade?");
        String[] nivelPrioridade = {"Alta", "Média","Baixa" };
        JComboBox ComboBoxPrioridade = new JComboBox(nivelPrioridade);


        JCheckBox FinalizarBox = new JCheckBox("Finalizado");
        JButton cancelarBox = new JButton("Cancelar");
        JButton SalvarBox = new JButton("Salvar");


        editJanela.setVerticalGroup(
                editJanela.createSequentialGroup()
                        .addComponent(CaixaTarefa)
                        .addComponent(textBox)
                        .addComponent(NivelPrioridade)
                        .addComponent(ComboBoxPrioridade)
                        .addComponent(FinalizarBox)
                        .addGroup(editJanela.createParallelGroup()
                                .addComponent(cancelarBox)
                                .addComponent(SalvarBox))

        );
        editJanela.setHorizontalGroup(
                editJanela.createParallelGroup()
                        .addComponent(CaixaTarefa)
                        .addComponent(textBox)
                        .addComponent(NivelPrioridade)
                        .addComponent(ComboBoxPrioridade)
                        .addComponent(FinalizarBox)
                        .addGroup(editJanela.createSequentialGroup().addContainerGap(100,300)
                                .addComponent(cancelarBox)
                                .addComponent(SalvarBox))
        );
        add(panel);
    }
}
