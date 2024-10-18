INSERT INTO produto (id, nome, quantidade, preco, descricao)
VALUES (NEXTVAL('seq_produto'), 'Notebook Dell Inspiron', 15, 3499.99,
        'Notebook com processador i5, 8GB RAM, SSD 256GB'),
       (NEXTVAL('seq_produto'), 'Smartphone Samsung Galaxy S21', 30, 2999.99,
        'Smartphone com 128GB, 6GB RAM, Câmera 64MP'),
       (NEXTVAL('seq_produto'), 'Mouse Gamer Logitech G502', 50, 299.99, 'Mouse gaming com 11 botões programáveis'),
       (NEXTVAL('seq_produto'), 'Teclado Mecânico Redragon', 25, 249.99, 'Teclado mecânico RGB com switches blue'),
       (NEXTVAL('seq_produto'), 'Monitor LG 24 polegadas', 20, 899.99, 'Monitor Full HD IPS 75Hz'),
       (NEXTVAL('seq_produto'), 'Headset HyperX Cloud II', 40, 399.99, 'Headset gamer com som surround 7.1'),
       (NEXTVAL('seq_produto'), 'SSD Kingston 480GB', 60, 299.99, 'SSD SATA III com velocidade de leitura 500MB/s'),
       (NEXTVAL('seq_produto'), 'Webcam Logitech C920', 35, 449.99, 'Webcam Full HD 1080p com microfone'),
       (NEXTVAL('seq_produto'), 'Impressora HP LaserJet', 10, 1299.99, 'Impressora laser monocromática'),
       (NEXTVAL('seq_produto'), 'Roteador TP-Link Archer C6', 45, 299.99, 'Roteador Dual Band AC1200');