/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is OpenEMRConnect.
 *
 * The Initial Developer of the Original Code is International Training &
 * Education Center for Health (I-TECH) <http://www.go2itech.org/>
 *
 * Portions created by the Initial Developer are Copyright (C) 2011
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *
 * ***** END LICENSE BLOCK ***** */

/*
 * ConfirmationDialog.java
 *
 * Created on Jun 23, 2011, 11:15:02 AM
 */
package ke.go.moh.oec.reception.gui;

import ke.go.moh.oec.Person;
import ke.go.moh.oec.reception.controller.PersonWrapper;
import ke.go.moh.oec.reception.data.DisplayableMaritalStatus;
import org.jdesktop.application.Action;

/**
 *
 * @author Gitahi Ng'ang'a
 */
public class ConfirmationDialog extends javax.swing.JDialog {

    private final PersonWrapper personWrapper;

    public ConfirmationDialog(java.awt.Frame parent, boolean modal, PersonWrapper personWrapper) {
        super(parent, modal);
        initComponents();
        this.personWrapper = personWrapper;
        populateFields();
    }

    private void populateFields() {
        clinicIdTextField.setText(personWrapper.getClinicId());
        firstNameTextField.setText(personWrapper.getFirstName());
        middleNameTextField.setText(personWrapper.getMiddleName());
        lastNameTextField.setText(personWrapper.getLastName());
        birthDateChooser.setDate(personWrapper.getBirthdate());
        Person.Sex sex = personWrapper.getSex();
        if (sex != null) {
            maleRadioButton.setSelected(sex == Person.Sex.M);
            femaleRadioButton.setSelected(sex == Person.Sex.F);
        } else {
            maleRadioButton.setSelected(false);
            femaleRadioButton.setSelected(false);
        }
        maritalStatusComboBox.setSelectedItem(DisplayableMaritalStatus.getDisplayableMaritalStatus(personWrapper.getMaritalStatus()));
        villageTextField.setText(personWrapper.getVillageName());
        fathersFirstNameTextField.setText(personWrapper.getFathersFirstName());
        fathersMiddleNameTextField.setText(personWrapper.getFathersMiddleName());
        fathersLastNameTextField.setText(personWrapper.getFathersLastName());
        mothersFirstNameTextField.setText(personWrapper.getMothersFirstName());
        mothersMiddleNameTextField.setText(personWrapper.getMothersMiddleName());
        mothersLastNameTextField.setText(personWrapper.getMothersLastName());
        compoundHeadsFirstNameTextField.setText(personWrapper.getCompoundHeadFirstName());
        compoundHeadsMiddleNameTextField.setText(personWrapper.getCompoundHeadMiddleName());
        compoundHeadsLastNameTextField.setText(personWrapper.getCompoundHeadLastName());
        hdssDataConsentYesRadioButton.setSelected(personWrapper.getConsentSigned() == Person.ConsentSigned.yes);
        hdssDataConsentNoRadioButton.setSelected(personWrapper.getConsentSigned() == Person.ConsentSigned.no);
        hdssDataConsentNoAnswerRadioButton.setSelected(personWrapper.getConsentSigned() == Person.ConsentSigned.notAnswered);
        hdssDataConsentYesRadioButton.setSelected(false);
        hdssDataConsentNoRadioButton.setSelected(false);
        hdssDataConsentNoAnswerRadioButton.setSelected(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        sexButtonGroup = new javax.swing.ButtonGroup();
        hdssDataConsentButtonGroup = new javax.swing.ButtonGroup();
        maritalStatusList = DisplayableMaritalStatus.getList();
        confirmationPanel = new javax.swing.JPanel();
        clinicIdLabel = new javax.swing.JLabel();
        clinicIdTextField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        middleNameLabel = new javax.swing.JLabel();
        middleNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        sexLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        birthDateLabel = new javax.swing.JLabel();
        birthDateChooser = new com.toedter.calendar.JDateChooser();
        maritalStatusLabel = new javax.swing.JLabel();
        maritalStatusComboBox = new javax.swing.JComboBox();
        villageLabel = new javax.swing.JLabel();
        villageTextField = new javax.swing.JTextField();
        fathersFirstNameLabel = new javax.swing.JLabel();
        fathersFirstNameTextField = new javax.swing.JTextField();
        fathersMiddleNameLabel = new javax.swing.JLabel();
        fathersMiddleNameTextField = new javax.swing.JTextField();
        fathersLastNameLabel = new javax.swing.JLabel();
        fathersLastNameTextField = new javax.swing.JTextField();
        mothersFirstNameLabel = new javax.swing.JLabel();
        mothersFirstNameTextField = new javax.swing.JTextField();
        mothersMiddleNameLabel = new javax.swing.JLabel();
        mothersMiddleNameTextField = new javax.swing.JTextField();
        mothersLastNameLabel = new javax.swing.JLabel();
        mothersLastNameTextField = new javax.swing.JTextField();
        compoundHeadsFirstNameLabel = new javax.swing.JLabel();
        compoundHeadsFirstNameTextField = new javax.swing.JTextField();
        compoundHeadsMiddleNameLabel = new javax.swing.JLabel();
        compoundHeadsMiddleNameTextField = new javax.swing.JTextField();
        compoundHeadsLastNameLabel = new javax.swing.JLabel();
        compoundHeadsLastNameTextField = new javax.swing.JTextField();
        hdssDataConsentLabel = new javax.swing.JLabel();
        hdssDataConsentYesRadioButton = new javax.swing.JRadioButton();
        hdssDataConsentNoRadioButton = new javax.swing.JRadioButton();
        hdssDataConsentNoAnswerRadioButton = new javax.swing.JRadioButton();
        acceptButton = new javax.swing.JButton();
        rejectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setName("Form"); // NOI18N
        setResizable(false);

        confirmationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Confirm"));
        confirmationPanel.setName("confirmationPanel"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(ke.go.moh.oec.reception.gui.App.class).getContext().getResourceMap(ConfirmationDialog.class);
        clinicIdLabel.setText(resourceMap.getString("clinicIdLabel.text")); // NOI18N
        clinicIdLabel.setName("clinicIdLabel"); // NOI18N

        clinicIdTextField.setEnabled(false);
        clinicIdTextField.setName("clinicIdTextField"); // NOI18N

        firstNameLabel.setText(resourceMap.getString("firstNameLabel.text")); // NOI18N
        firstNameLabel.setName("firstNameLabel"); // NOI18N

        firstNameTextField.setEnabled(false);
        firstNameTextField.setName("firstNameTextField"); // NOI18N

        middleNameLabel.setText(resourceMap.getString("middleNameLabel.text")); // NOI18N
        middleNameLabel.setName("middleNameLabel"); // NOI18N

        middleNameTextField.setEnabled(false);
        middleNameTextField.setName("middleNameTextField"); // NOI18N

        lastNameLabel.setText(resourceMap.getString("lastNameLabel.text")); // NOI18N
        lastNameLabel.setName("lastNameLabel"); // NOI18N

        lastNameTextField.setEnabled(false);
        lastNameTextField.setName("lastNameTextField"); // NOI18N

        sexLabel.setText(resourceMap.getString("sexLabel.text")); // NOI18N
        sexLabel.setName("sexLabel"); // NOI18N

        sexButtonGroup.add(maleRadioButton);
        maleRadioButton.setText(resourceMap.getString("maleRadioButton.text")); // NOI18N
        maleRadioButton.setEnabled(false);
        maleRadioButton.setName("maleRadioButton"); // NOI18N

        sexButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText(resourceMap.getString("femaleRadioButton.text")); // NOI18N
        femaleRadioButton.setEnabled(false);
        femaleRadioButton.setName("femaleRadioButton"); // NOI18N

        birthDateLabel.setText(resourceMap.getString("birthDateLabel.text")); // NOI18N
        birthDateLabel.setName("birthDateLabel"); // NOI18N

        birthDateChooser.setEnabled(false);
        birthDateChooser.setName("birthDateChooser"); // NOI18N

        maritalStatusLabel.setText(resourceMap.getString("maritalStatusLabel.text")); // NOI18N
        maritalStatusLabel.setName("maritalStatusLabel"); // NOI18N

        maritalStatusComboBox.setEnabled(false);
        maritalStatusComboBox.setName("maritalStatusComboBox"); // NOI18N

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, maritalStatusList, maritalStatusComboBox);
        bindingGroup.addBinding(jComboBoxBinding);

        villageLabel.setText(resourceMap.getString("villageLabel.text")); // NOI18N
        villageLabel.setName("villageLabel"); // NOI18N

        villageTextField.setEnabled(false);
        villageTextField.setName("villageTextField"); // NOI18N

        fathersFirstNameLabel.setText(resourceMap.getString("fathersFirstNameLabel.text")); // NOI18N
        fathersFirstNameLabel.setName("fathersFirstNameLabel"); // NOI18N

        fathersFirstNameTextField.setEnabled(false);
        fathersFirstNameTextField.setName("fathersFirstNameTextField"); // NOI18N

        fathersMiddleNameLabel.setText(resourceMap.getString("fathersMiddleNameLabel.text")); // NOI18N
        fathersMiddleNameLabel.setName("fathersMiddleNameLabel"); // NOI18N

        fathersMiddleNameTextField.setEnabled(false);
        fathersMiddleNameTextField.setName("fathersMiddleNameTextField"); // NOI18N

        fathersLastNameLabel.setText(resourceMap.getString("fathersLastNameLabel.text")); // NOI18N
        fathersLastNameLabel.setName("fathersLastNameLabel"); // NOI18N

        fathersLastNameTextField.setEnabled(false);
        fathersLastNameTextField.setName("fathersLastNameTextField"); // NOI18N

        mothersFirstNameLabel.setText(resourceMap.getString("mothersFirstNameLabel.text")); // NOI18N
        mothersFirstNameLabel.setName("mothersFirstNameLabel"); // NOI18N

        mothersFirstNameTextField.setEnabled(false);
        mothersFirstNameTextField.setName("mothersFirstNameTextField"); // NOI18N

        mothersMiddleNameLabel.setText(resourceMap.getString("mothersMiddleNameLabel.text")); // NOI18N
        mothersMiddleNameLabel.setName("mothersMiddleNameLabel"); // NOI18N

        mothersMiddleNameTextField.setEnabled(false);
        mothersMiddleNameTextField.setName("mothersMiddleNameTextField"); // NOI18N

        mothersLastNameLabel.setText(resourceMap.getString("mothersLastNameLabel.text")); // NOI18N
        mothersLastNameLabel.setName("mothersLastNameLabel"); // NOI18N

        mothersLastNameTextField.setEnabled(false);
        mothersLastNameTextField.setName("mothersLastNameTextField"); // NOI18N

        compoundHeadsFirstNameLabel.setText(resourceMap.getString("compoundHeadsFirstNameLabel.text")); // NOI18N
        compoundHeadsFirstNameLabel.setName("compoundHeadsFirstNameLabel"); // NOI18N

        compoundHeadsFirstNameTextField.setEnabled(false);
        compoundHeadsFirstNameTextField.setName("compoundHeadsFirstNameTextField"); // NOI18N

        compoundHeadsMiddleNameLabel.setText(resourceMap.getString("compoundHeadsMiddleNameLabel.text")); // NOI18N
        compoundHeadsMiddleNameLabel.setName("compoundHeadsMiddleNameLabel"); // NOI18N

        compoundHeadsMiddleNameTextField.setEnabled(false);
        compoundHeadsMiddleNameTextField.setName("compoundHeadsMiddleNameTextField"); // NOI18N

        compoundHeadsLastNameLabel.setText(resourceMap.getString("compoundHeadsLastNameLabel.text")); // NOI18N
        compoundHeadsLastNameLabel.setName("compoundHeadsLastNameLabel"); // NOI18N

        compoundHeadsLastNameTextField.setEnabled(false);
        compoundHeadsLastNameTextField.setName("compoundHeadsLastNameTextField"); // NOI18N

        hdssDataConsentLabel.setText(resourceMap.getString("hdssDataConsentLabel.text")); // NOI18N
        hdssDataConsentLabel.setName("hdssDataConsentLabel"); // NOI18N

        hdssDataConsentButtonGroup.add(hdssDataConsentYesRadioButton);
        hdssDataConsentYesRadioButton.setText(resourceMap.getString("hdssDataConsentYesRadioButton.text")); // NOI18N
        hdssDataConsentYesRadioButton.setEnabled(false);
        hdssDataConsentYesRadioButton.setName("hdssDataConsentYesRadioButton"); // NOI18N

        hdssDataConsentButtonGroup.add(hdssDataConsentNoRadioButton);
        hdssDataConsentNoRadioButton.setText(resourceMap.getString("hdssDataConsentNoRadioButton.text")); // NOI18N
        hdssDataConsentNoRadioButton.setEnabled(false);
        hdssDataConsentNoRadioButton.setName("hdssDataConsentNoRadioButton"); // NOI18N

        hdssDataConsentButtonGroup.add(hdssDataConsentNoAnswerRadioButton);
        hdssDataConsentNoAnswerRadioButton.setText(resourceMap.getString("hdssDataConsentNoAnswerRadioButton.text")); // NOI18N
        hdssDataConsentNoAnswerRadioButton.setEnabled(false);
        hdssDataConsentNoAnswerRadioButton.setName("hdssDataConsentNoAnswerRadioButton"); // NOI18N

        javax.swing.GroupLayout confirmationPanelLayout = new javax.swing.GroupLayout(confirmationPanel);
        confirmationPanel.setLayout(confirmationPanelLayout);
        confirmationPanelLayout.setHorizontalGroup(
            confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compoundHeadsLastNameLabel)
                    .addGroup(confirmationPanelLayout.createSequentialGroup()
                        .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compoundHeadsMiddleNameLabel)
                            .addComponent(hdssDataConsentLabel)
                            .addComponent(compoundHeadsFirstNameLabel)
                            .addComponent(mothersLastNameLabel)
                            .addComponent(mothersMiddleNameLabel)
                            .addComponent(mothersFirstNameLabel)
                            .addComponent(firstNameLabel)
                            .addComponent(clinicIdLabel)
                            .addComponent(fathersMiddleNameLabel)
                            .addComponent(fathersLastNameLabel)
                            .addComponent(maritalStatusLabel)
                            .addComponent(villageLabel)
                            .addComponent(middleNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(sexLabel)
                            .addComponent(birthDateLabel)
                            .addComponent(fathersFirstNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(confirmationPanelLayout.createSequentialGroup()
                                .addComponent(maleRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(femaleRadioButton))
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(maritalStatusComboBox, 0, 743, Short.MAX_VALUE)
                            .addComponent(fathersFirstNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(birthDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(mothersFirstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(mothersMiddleNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(mothersLastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(compoundHeadsFirstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addGroup(confirmationPanelLayout.createSequentialGroup()
                                .addComponent(hdssDataConsentYesRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hdssDataConsentNoRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hdssDataConsentNoAnswerRadioButton))
                            .addComponent(compoundHeadsLastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(compoundHeadsMiddleNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(clinicIdTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(villageTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(fathersMiddleNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(fathersLastNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                            .addComponent(middleNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE))))
                .addContainerGap())
        );
        confirmationPanelLayout.setVerticalGroup(
            confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmationPanelLayout.createSequentialGroup()
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clinicIdLabel)
                    .addComponent(clinicIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middleNameLabel)
                    .addComponent(middleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexLabel)
                    .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(femaleRadioButton)
                        .addComponent(maleRadioButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthDateLabel)
                    .addComponent(birthDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maritalStatusLabel)
                    .addComponent(maritalStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(villageLabel)
                    .addComponent(villageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fathersFirstNameLabel)
                    .addComponent(fathersFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fathersMiddleNameLabel)
                    .addComponent(fathersMiddleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fathersLastNameLabel)
                    .addComponent(fathersLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mothersFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mothersFirstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mothersMiddleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mothersMiddleNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mothersLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mothersLastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compoundHeadsFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compoundHeadsFirstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compoundHeadsMiddleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compoundHeadsMiddleNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compoundHeadsLastNameLabel)
                    .addComponent(compoundHeadsLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hdssDataConsentLabel)
                    .addComponent(hdssDataConsentYesRadioButton)
                    .addComponent(hdssDataConsentNoRadioButton)
                    .addComponent(hdssDataConsentNoAnswerRadioButton)))
        );

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(ke.go.moh.oec.reception.gui.App.class).getContext().getActionMap(ConfirmationDialog.class, this);
        acceptButton.setAction(actionMap.get("accept")); // NOI18N
        acceptButton.setText(resourceMap.getString("acceptButton.text")); // NOI18N
        acceptButton.setName("acceptButton"); // NOI18N

        rejectButton.setAction(actionMap.get("reject")); // NOI18N
        rejectButton.setText(resourceMap.getString("rejectButton.text")); // NOI18N
        rejectButton.setName("rejectButton"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rejectButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                    .addComponent(acceptButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                    .addComponent(confirmationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acceptButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Action
    public void accept() {
        personWrapper.setConfirmed(true);
        dispose();
    }

    @Action
    public void reject() {
        personWrapper.setConfirmed(false);
        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private com.toedter.calendar.JDateChooser birthDateChooser;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JLabel clinicIdLabel;
    private javax.swing.JTextField clinicIdTextField;
    private javax.swing.JLabel compoundHeadsFirstNameLabel;
    private javax.swing.JTextField compoundHeadsFirstNameTextField;
    private javax.swing.JLabel compoundHeadsLastNameLabel;
    private javax.swing.JTextField compoundHeadsLastNameTextField;
    private javax.swing.JLabel compoundHeadsMiddleNameLabel;
    private javax.swing.JTextField compoundHeadsMiddleNameTextField;
    private javax.swing.JPanel confirmationPanel;
    private javax.swing.JLabel fathersFirstNameLabel;
    private javax.swing.JTextField fathersFirstNameTextField;
    private javax.swing.JLabel fathersLastNameLabel;
    private javax.swing.JTextField fathersLastNameTextField;
    private javax.swing.JLabel fathersMiddleNameLabel;
    private javax.swing.JTextField fathersMiddleNameTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.ButtonGroup hdssDataConsentButtonGroup;
    private javax.swing.JLabel hdssDataConsentLabel;
    private javax.swing.JRadioButton hdssDataConsentNoAnswerRadioButton;
    private javax.swing.JRadioButton hdssDataConsentNoRadioButton;
    private javax.swing.JRadioButton hdssDataConsentYesRadioButton;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JComboBox maritalStatusComboBox;
    private javax.swing.JLabel maritalStatusLabel;
    private java.util.List<DisplayableMaritalStatus> maritalStatusList;
    private javax.swing.JLabel middleNameLabel;
    private javax.swing.JTextField middleNameTextField;
    private javax.swing.JLabel mothersFirstNameLabel;
    private javax.swing.JTextField mothersFirstNameTextField;
    private javax.swing.JLabel mothersLastNameLabel;
    private javax.swing.JTextField mothersLastNameTextField;
    private javax.swing.JLabel mothersMiddleNameLabel;
    private javax.swing.JTextField mothersMiddleNameTextField;
    private javax.swing.JButton rejectButton;
    private javax.swing.ButtonGroup sexButtonGroup;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JLabel villageLabel;
    private javax.swing.JTextField villageTextField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
