package ec.edu.uce.GrupalLogica.view;

import ec.edu.uce.GrupalLogica.Services.FabricaService;
import ec.edu.uce.GrupalLogica.Services.ProductoService;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;

public class FabricaUI {
    private FabricaService fabricaService;
    private ProductoService productoService;

    public FabricaUI(FabricaService fabricaService, ProductoService productoService) {
        this.fabricaService = fabricaService;
        this.productoService = productoService;
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Fábrica de Ropa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Producto:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JComboBox<String> productoComboBox = new JComboBox<>();
        productoComboBox.setBounds(100, 20, 165, 25);
        panel.add(productoComboBox);


        JButton fabricarButton = new JButton("Fabricar");
        fabricarButton.setBounds(10, 80, 150, 25);
        panel.add(fabricarButton);

    }

//    public static void main(String[] args) {
//        ProductoService productoService = new ProductoService(new RestTemplate());
//        FabricaService fabricaService = new FabricaService();
//        SwingUtilities.invokeLater(() -> new FabricaUI(fabricaService, productoService));
//    }
}