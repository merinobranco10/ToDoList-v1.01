import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class confVentana {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    confBoton bmb1 = new confBoton("Agregar Tarea");
    confBoton bmb2 = new confBoton("Eliminar Tarea");
    confBoton bmb3 = new confBoton("Tarea Completada");
    confLabel lbP = new confLabel("Pendientes:");
    confLabel lbC = new confLabel("Completadas:");
    DefaultListModel<String> listaPendientes = new DefaultListModel<>();
    DefaultListModel<String> listaCompletadas = new DefaultListModel<>();
    JList<String> listaTareasPendientes = new JList<>(listaPendientes);
    JList<String> listaTareasCompletadas = new JList<>(listaCompletadas);
    ArrayList<String> tareas = new ArrayList<>();

    public confVentana() {}

    void inicializar() {
        frame.setTitle("TO DO LIST v.1.0.1");
        frame.setSize(1250, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        cargar();

        bmb1.addActionListener(e -> agregar());
        bmb2.addActionListener(e -> eliminar());
        bmb3.addActionListener(e -> marcar(listaTareasPendientes.getSelectedValue()));

        bmb1.setPreferredSize(new Dimension(180, 70));
        bmb2.setPreferredSize(new Dimension(180, 70));
        bmb3.setPreferredSize(new Dimension(180, 70));

        bmb1.setFont(new Font("Arial", Font.PLAIN, 18));
        bmb2.setFont(new Font("Arial", Font.PLAIN, 18));
        bmb3.setFont(new Font("Arial", Font.PLAIN, 18));

        bmb1.setForeground(Color.BLUE);
        bmb3.setForeground(Color.GREEN);
        bmb2.setForeground(Color.RED);

        bmb1.setBounds(10, 425, 255, 70);
        bmb2.setBounds(555, 425, 255, 70);
        bmb3.setBounds(280, 425, 255, 70);
        lbP.setBounds(10, 65, 200, 30);
        lbC.setBounds(555, 65, 200, 30);

        JScrollPane scrollPanePendientes = new JScrollPane(listaTareasPendientes);
        scrollPanePendientes.setBounds(10, 100, 525, 320);
        listaTareasPendientes.setBackground(Color.LIGHT_GRAY);
        listaTareasPendientes.setFont(new Font("Arial", Font.PLAIN, 17));

        JScrollPane scrollPaneCompletadas = new JScrollPane(listaTareasCompletadas);
        scrollPaneCompletadas.setBounds(555, 100, 525, 320);
        listaTareasCompletadas.setBackground(Color.LIGHT_GRAY);
        listaTareasCompletadas.setFont(new Font("Arial", Font.PLAIN, 17));

        JLabel titleLabel = new JLabel("TO DO LIST v1.0.1");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(10, 10, 400, 55);

        panel.add(bmb1);
        panel.add(bmb2);
        panel.add(bmb3);
        panel.add(lbP);
        panel.add(lbC);
        panel.add(scrollPanePendientes);
        panel.add(scrollPaneCompletadas);
        panel.add(titleLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
    void agregar() {
        String tareaInput = JOptionPane.showInputDialog(frame, "Ingrese la tarea:");
        if (tareaInput != null && !tareaInput.isEmpty()) {
            tareas.add(tareaInput + " - Pendiente");
            listaPendientes.addElement(tareaInput + " - Pendiente");
            guardar();
        }
    }
    void eliminar() {
        String tarea = listaTareasPendientes.getSelectedValue();
        if (tarea == null) {
            tarea = listaTareasCompletadas.getSelectedValue();
        }
        if (tarea != null && !tarea.isEmpty()) {
            tareas.remove(tarea);
            listaPendientes.removeElement(tarea);
            listaCompletadas.removeElement(tarea);
            guardar();
        }
    }
    void marcar(String tarea) {
        if (tarea != null && !tarea.isEmpty()) {
            tareas.remove(tarea);
            String tareaCompletada = tarea.replace("Pendiente", "Completada");
            listaPendientes.removeElement(tarea);
            listaCompletadas.addElement(tareaCompletada);
            tareas.add(tareaCompletada);
            guardar();
        }
    }
    void guardar() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("tareas.txt"));
            for (String tarea : tareas) {
                writer.write(tarea);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void cargar() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("tareas.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                if (text.contains("Pendiente")) {
                    listaPendientes.addElement(text);
                } else {
                    listaCompletadas.addElement(text);
                }
                tareas.add(text);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
