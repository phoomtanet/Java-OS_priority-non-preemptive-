package projeck;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



@SuppressWarnings("serial")
public class Gui extends javax.swing.JFrame {
	private static Controller controller = new Controller();

	public Gui() {
		initComponents();
	}

	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane2 = new javax.swing.JScrollPane();
		TerminatedTB = new javax.swing.JTable();
		jScrollPane3 = new javax.swing.JScrollPane();
		ReadyTb = new javax.swing.JTable();
		jPanel2 = new javax.swing.JPanel();
		AddBT = new javax.swing.JButton();
		terminateBT = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		Clocktime = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		PcbTB = new javax.swing.JTable();
		jPanel3 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		AddIO = new javax.swing.JButton();
		ClossIO = new javax.swing.JButton();
		jScrollPane4 = new javax.swing.JScrollPane();
		ioTB = new javax.swing.JTable();
		jPanel6 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		Runlabel = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		IOlabel = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		AgvTurnaroundlabel = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		Waitinglabel = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		permemory = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		Totalmemory = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		Remainmemory = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		TerminatedTB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		TerminatedTB.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Process Name", "Priority", "Arrival Time", "Burst Time", "Waitting Time", "Status" }));
		TerminatedTB.setRowHeight(26);
		jScrollPane2.setViewportView(TerminatedTB);

		ReadyTb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		ReadyTb.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Process Name", "Priority", "Arrival Time", "Status" }));
		ReadyTb.setRowHeight(26);
		jScrollPane3.setViewportView(ReadyTb);

		jPanel2.setBackground(new java.awt.Color(102, 204, 255));

		AddBT.setBackground(new java.awt.Color(0, 204, 51));
		AddBT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		AddBT.setText("Add Process");
		AddBT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AddBTActionPerformed(evt);
			}
		});

		terminateBT.setBackground(new java.awt.Color(255, 51, 51));
		terminateBT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		terminateBT.setText("Terminate");
		terminateBT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				terminateBTActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("Priority Non-Preemptive scheduling");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addContainerGap(107, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel3).addComponent(AddBT, javax.swing.GroupLayout.PREFERRED_SIZE, 113,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(terminateBT,
								javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(17, 17, 17).addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(terminateBT, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(AddBT, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		jPanel1.setBackground(new java.awt.Color(102, 255, 255));
		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

		Clocktime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		Clocktime.setText("0");

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jLabel1.setText("Clock :");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(43, 43, 43).addComponent(jLabel1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(Clocktime, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
								.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1).addComponent(Clocktime))
								.addContainerGap()));

		PcbTB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		PcbTB.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Process Name", "Priority", "Arrival  Time", "Burst Time", "Waitting Time", "Status",
				"Memory" }));
		PcbTB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		PcbTB.setGridColor(new java.awt.Color(0, 0, 0));
		PcbTB.setRowHeight(26);
		jScrollPane1.setViewportView(PcbTB);

		jPanel3.setBackground(new java.awt.Color(102, 204, 255));
		jPanel3.setForeground(new java.awt.Color(255, 255, 255));

		jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("Ready Queue");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel2).addGap(216, 216, 216)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel2).addGap(15, 15, 15)));

		jPanel4.setBackground(new java.awt.Color(102, 204, 255));

		jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("Terminate");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel4Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel4).addGap(314, 314, 314)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel4Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel4).addGap(15, 15, 15)));

		jPanel5.setBackground(new java.awt.Color(102, 204, 255));

		jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("IO Queue");

		AddIO.setBackground(new java.awt.Color(0, 204, 51));
		AddIO.setText("Add Printer");
		AddIO.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AddIOActionPerformed(evt);
			}
		});

		ClossIO.setBackground(new java.awt.Color(255, 51, 51));
		ClossIO.setText("Closs");
		ClossIO.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ClossIOActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(AddIO, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(ClossIO, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addComponent(jLabel5).addGap(0, 31, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel5Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(AddIO).addComponent(ClossIO))
								.addContainerGap()));

		ioTB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		ioTB.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Porcess name", "Running Time", "Respond Time", "Status" }));
		ioTB.setRowHeight(26);
		jScrollPane4.setViewportView(ioTB);

		jPanel6.setBackground(new java.awt.Color(204, 204, 204));

		jLabel6.setBackground(new java.awt.Color(255, 255, 255));
		jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
		jLabel6.setText("Controller");

		jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel7.setText("Cpu Process :");

		Runlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		Runlabel.setText("empty");

		jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel9.setText("IO Process :");

		IOlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		IOlabel.setText("empty");

		jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel13.setText("AVG Turnaround Time :");

		AgvTurnaroundlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		AgvTurnaroundlabel.setText("0");

		jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel14.setText("AVG Waitting Time :");

		Waitinglabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		Waitinglabel.setText("0");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addGap(18, 18, 18)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel6Layout.createSequentialGroup().addComponent(jLabel7)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(Runlabel)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel6Layout.createSequentialGroup().addComponent(jLabel9)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(IOlabel))
										.addGroup(jPanel6Layout.createSequentialGroup().addComponent(jLabel13)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(AgvTurnaroundlabel))
										.addGroup(jPanel6Layout.createSequentialGroup().addComponent(jLabel14)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(Waitinglabel)))
										.addGap(0, 0, Short.MAX_VALUE))))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel6Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel6).addGap(67, 67, 67)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addComponent(jLabel6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(Runlabel))
						.addGap(7, 7, 7)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel9).addComponent(IOlabel))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel14).addComponent(Waitinglabel))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel13).addComponent(AgvTurnaroundlabel))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel7.setBackground(new java.awt.Color(204, 204, 204));

		jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
		jLabel10.setText("Memory");

		jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel8.setText("Used Memory Percentage  :");

		permemory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		permemory.setText("0");

		jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel11.setText(" Total Memory : ");

		Totalmemory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		Totalmemory.setText("0");

		jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel12.setText("Used Memory :");

		Remainmemory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		Remainmemory.setText("0");

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addGap(12, 12, 12)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel7Layout.createSequentialGroup().addComponent(jLabel11)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(Totalmemory))
								.addGroup(jPanel7Layout.createSequentialGroup().addGap(6, 6, 6).addGroup(jPanel7Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel7Layout.createSequentialGroup().addComponent(jLabel12)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(Remainmemory))
										.addGroup(jPanel7Layout.createSequentialGroup().addComponent(jLabel8)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(permemory)))))
						.addGap(0, 73, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel7Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel10).addGap(81, 81, 81)));
		jPanel7Layout
				.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel7Layout.createSequentialGroup().addComponent(jLabel10)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel11).addComponent(Totalmemory))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel12).addComponent(Remainmemory))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel8).addComponent(permemory))
								.addGap(0, 38, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(jScrollPane2)
						.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jScrollPane1))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jScrollPane4)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(6, 6, 6)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
												Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGap(1982, 1982, 1982)));

		pack();
	}// </editor-fold>

	private void AddBTActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (controller.getintPermemory() < 90) {
			controller.creatProcess();
		} else {
			JOptionPane.showMessageDialog(null,
					"The memory is almost full, please click terminate to delete the process..","Warning",
					JOptionPane.WARNING_MESSAGE);
		}

	}

	private void terminateBTActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (controller.getCheckrunJOB() == true) {
			controller.Terminated();

		} else {
			JOptionPane.showMessageDialog(null, 
					"Not have process is running... ","Warning",
					JOptionPane.WARNING_MESSAGE);
		}
	} // </editor-fold>

	private void AddIOActionPerformed(java.awt.event.ActionEvent evt) {

		if (controller.getCheckrunJOB() == true) {
			controller.AddIO();

		} else {
			JOptionPane.showMessageDialog(null, 
					"Not have process is running... ","Warning",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private void ClossIOActionPerformed(java.awt.event.ActionEvent evt) {

		if (controller.getCheckrunIO() == true) {
			controller.IOcloss();

		} else {
			JOptionPane.showMessageDialog(null,
					"Not have io is running... ","Warning", 
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * @param args the command line arguments
	 */

	public static void showJob(String text) {
		try {
			DefaultTableModel jobtb = (DefaultTableModel) PcbTB.getModel();
			int rowCount = jobtb.getRowCount();
			for (int i = rowCount -1; i >= 0; i--) {
				jobtb.removeRow(i);
			}

			String[] textrow = text.split(",");
			for (int i = 0; i < textrow.length; i++) {
				String[] textcolumn = textrow[i].split("/");
				jobtb.addRow(new Object[] { textcolumn[0], textcolumn[1], textcolumn[2], textcolumn[3], textcolumn[4],
						textcolumn[5], textcolumn[6] });
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		}
	}


	
	public static void showReady(String text) {
		try {
			DefaultTableModel readytb = (DefaultTableModel) ReadyTb.getModel();
			int rowCount = readytb.getRowCount();
			for (int i = rowCount - 1; i >= 0; i--) {
				readytb.removeRow(i);
			}
			String[] textrow = text.split(",");
			for (int i = 0; i < textrow.length; i++) {
				String[] textcolumn = textrow[i].split("/");
				readytb.addRow(new Object[] { textcolumn[0], textcolumn[1], textcolumn[2], textcolumn[3] });
			}
		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	public static void showterminate(String text) {
		try {
			DefaultTableModel terminatetb = (DefaultTableModel) TerminatedTB.getModel();
			int rowCount = terminatetb.getRowCount();
			for (int i = rowCount - 1; i >= 0; i--) {
				terminatetb.removeRow(i);
			}
			String[] textrow = text.split(",");
			for (int i = 0; i < textrow.length; i++) {
				String[] textcolumn = textrow[i].split("/");
				terminatetb.addRow(new Object[] { textcolumn[0], textcolumn[1], textcolumn[2], textcolumn[3],
						textcolumn[4], textcolumn[5] });
			}
		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	public static void showIO(String text) {
		try {
			DefaultTableModel iotable = (DefaultTableModel) ioTB.getModel();
			int rowCount = iotable.getRowCount();
			for (int i = rowCount - 1; i >= 0; i--) {
				iotable.removeRow(i);
			}
			String[] textrow = text.split(",");
			for (int i = 0; i < textrow.length; i++) {
				String[] textcolumn = textrow[i].split("/");
				iotable.addRow(new Object[] { textcolumn[0], textcolumn[1], textcolumn[2], textcolumn[3] });
			}
		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Gui().setVisible(true);

				Timer timer1 = new Timer();
				Timer timer2 = new Timer();

				TimerTask task1 = new TimerTask() {

					@Override
					public void run() {
						
					
						Clocktime.setText(controller.TextClock());
						
						showJob(controller.TextJobQ());
						showReady(controller.TextReadyQ());
						showIO(controller.TextIOQ());
						showterminate(controller.TextTerminateQ());
						
						controller.newToReady();
						controller.ReadyToQueue();
						controller.RaedyToRunning();
						controller.BurstAndWaitingTime();
						controller.IORun();
						controller.IOBurstAndWaitingTime();
						controller.AVGTurnaroundandWaiting();
						controller.RemoveAuto();
						
						
					}
				};
				timer1.scheduleAtFixedRate(task1, 0, 1000);

				TimerTask task2 = new TimerTask() {
					@Override
					public void run() {

						controller.MemoryUse();
		
						if (controller.getCheckrunJOB() == true) {
							Runlabel.setText(controller.textRunJOB());
						} else {
							Runlabel.setText("Empty");
						}
						if (controller.getCheckrunIO() == true) {
							IOlabel.setText(controller.textRunIO());
						} else {
							IOlabel.setText("Empty");
						}
						
						AgvTurnaroundlabel.setText(controller.textTurnaroundAGV());
						Waitinglabel.setText(controller.textWaitingAGV());
						
						Totalmemory.setText(controller.textmaxMemoryMB() + " MB");
						Remainmemory.setText(controller.textUsememoryMB() + " MB");
						permemory.setText(controller.textPermemory() + "%");
					
					
						if (controller.getCheckrunIO() == true) {
							ClossIO.setEnabled(true);

						} else {
							ClossIO.setEnabled(false);
						}
						if (controller.getCheckrunJOB() == true) {
							terminateBT.setEnabled(true);

						} else {
							terminateBT.setEnabled(false);
						}
					}
					
					
				};

				timer2.scheduleAtFixedRate(task2, 0, 100);

			}

		});
	}

	// Variables declaration - do not modify
	private static javax.swing.JButton AddBT;
	private static javax.swing.JButton AddIO;
	private static javax.swing.JLabel AgvTurnaroundlabel;
	private static javax.swing.JLabel Clocktime;
	private static javax.swing.JButton ClossIO;
	private static javax.swing.JLabel IOlabel;
	private static javax.swing.JTable PcbTB;
	private static javax.swing.JTable ReadyTb;
	private static javax.swing.JLabel Remainmemory;
	private static javax.swing.JLabel Runlabel;
	private static javax.swing.JTable TerminatedTB;
	private static javax.swing.JLabel Totalmemory;
	private static javax.swing.JLabel Waitinglabel;
	private static javax.swing.JTable ioTB;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private static javax.swing.JLabel permemory;
	private static javax.swing.JButton terminateBT;
	// End of variables declaration
}
