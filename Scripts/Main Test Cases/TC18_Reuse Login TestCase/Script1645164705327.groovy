import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.comment('Launch URL')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Common Test Cases/Login'), [('Username') : 'John Doe', ('Password') : 'ThisIsNotAPassword'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_AppointmentConfirmation/a_Make Appointment'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/input_Medicare_programs'))

WebUI.click(findTestObject('Page_CuraAppointment/span_Visit Date (Required)_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Page_CuraAppointment/td_24'))

WebUI.setText(findTestObject('Page_AppointmentConfirmation/textarea_Comment_comment'), 'Make my appointment ASAP')

WebUI.click(findTestObject('Page_AppointmentConfirmation/button_Book Appointment'))

WebUI.verifyTextPresent('Appointment Confirmation', true)

WebUI.closeBrowser()

