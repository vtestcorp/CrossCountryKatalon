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

WebUI.comment('User enters valid Credentials')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

WebUI.setText(findTestObject('Page_Login/txt_UserName'), 'John Doe')

WebUI.setText(findTestObject('Page_Login/txt_Password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_Login/btn_Login'))

WebUI.comment('Login sucessfully')

WebUI.click(findTestObject('Page_AppointmentConfirmation/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.comment('User Navigate to appoinmnet page')

WebUI.verifyElementVisible(findTestObject('Page_CuraAppointment/lst_Facility'))

WebUI.verifyElementClickable(findTestObject('Page_CuraAppointment/lst_Facility'))

WebUI.click(findTestObject('Page_CuraAppointment/Page_CURA Healthcare Service/Page_CURA Healthcare Service/select_'))

WebUI.verifyOptionsPresent(findTestObject('Page_CuraAppointment/Page_CURA Healthcare Service/Page_CURA Healthcare Service/select_'), 
    ['Tokyo CURA Healthcare Center', 'Hongkong CURA Healthcare Center', 'Seoul CURA Healthcare Center'])

WebUI.closeBrowser()

