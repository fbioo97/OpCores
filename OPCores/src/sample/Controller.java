package sample;


    import javafx.collections.FXCollections;
    import javafx.collections.ObservableList;
    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.scene.control.ComboBox;
    import javafx.scene.layout.AnchorPane;
    import javafx.scene.layout.HBox;
    import javafx.scene.layout.VBox;

    public class Controller {

        @FXML
        private HBox HBoxTopo;

        @FXML
        private VBox VBoxEsquerda;

        @FXML
        private HBox HBoxRodaPe;

        @FXML
        private VBox VBoxDireita;

        @FXML
        private AnchorPane AnchorCentro;

        @FXML
        private ComboBox<String> cmbUp;

        @FXML
        private ComboBox<String> cmbLeft;

        @FXML
        private ComboBox<String> cmbRight;

        @FXML
        private ComboBox<String> cmbCenter;

        @FXML
        private ComboBox<String> cmbDown;

        @FXML
        private void initialize() {
            String coresUP[] = {"Amarelo", "Azul", "Vermelho"};
            String coresLeft[] = {"Preto", "Cinza", "Prata"};
            String coresRigth[] = {"Preto", "Cinza", "Prata"};
            String coresDown[] = {"Ouro", "Azul Escuro", "Grená"};
            String coresCenter[] = {"Amarelo Claro", "Azul Claro", " Rosa"};

            ObservableList upListCores = FXCollections.observableArrayList(coresUP);
            cmbUp.setItems(upListCores);
            ObservableList leftListCores = FXCollections.observableArrayList(coresLeft);
            cmbLeft.setItems(leftListCores);
            ObservableList rigthListCores = FXCollections.observableArrayList(coresRigth);
            cmbRight.setItems(rigthListCores);
            ObservableList downListCores = FXCollections.observableArrayList(coresDown);
            cmbDown.setItems(downListCores);
            ObservableList centerListCores = FXCollections.observableArrayList(coresCenter);
            cmbCenter.setItems(centerListCores);
        }

        @FXML
        void preenchercorcentro(ActionEvent event) {
            String corSelecionada = cmbCenter.getSelectionModel().getSelectedItem();
            if (corSelecionada.equals("Amarelo Claro")) {
                AnchorCentro.setStyle("-fx-background-color:#f4fb6e");
            } else if (corSelecionada.equals("Azul Claro")) {
                AnchorCentro.setStyle("-fx-background-color:#B0E0E6");
            } else {
                AnchorCentro.setStyle("-fx-background-color:#FFDAB9");

            }
        }

        @FXML
        void preenchercordireita(ActionEvent event) {
            String corSelecionada = cmbRight.getSelectionModel().getSelectedItem();
            if (corSelecionada.equals("Preto")) {
                VBoxDireita.setStyle("-fx-background-color:#000000");
            } else if (corSelecionada.equals("Cinza")) {
                VBoxDireita.setStyle("-fx-background-color:#363636");
            } else {
                VBoxDireita.setStyle("-fx-background-color:#A9A9A9");

            }
        }

        @FXML
        void preenchercoresquerda(ActionEvent event) {
            String corSelecionada = cmbLeft.getSelectionModel().getSelectedItem();
            if (corSelecionada.equals("Preto")) {
                VBoxEsquerda.setStyle("-fx-background-color:#000000");
            } else if (corSelecionada.equals("Cinza")) {
                VBoxEsquerda.setStyle("-fx-background-color:#363636");
            } else {
                VBoxEsquerda.setStyle("-fx-background-color:#A9A9A9");

            }
        }

        @FXML
        void preenchercorrodape(ActionEvent event) {
            String corSelecionada = cmbDown.getSelectionModel().getSelectedItem();
            if (corSelecionada.equals("Ouro")) {
                HBoxRodaPe.setStyle("-fx-background-color:#FFD700");
            } else if (corSelecionada.equals("Azul Escuro")) {
                HBoxRodaPe.setStyle("-fx-background-color:#0000FF");
            } else {
                HBoxRodaPe.setStyle("-fx-background-color:#800000");

            }
        }
        @FXML
        void preenchercortopo(ActionEvent event) {
            String corSelecionada = cmbUp.getSelectionModel().getSelectedItem();
            if (corSelecionada.equals("Amarelo")) {
                HBoxTopo.setStyle("-fx-background-color:#FFFF00");
            } else if (corSelecionada.equals("Azul")) {
                HBoxTopo.setStyle("-fx-background-color:#0000FF");
            } else {
                HBoxTopo.setStyle("-fx-background-color:#FF0500");
            }


        }
    }