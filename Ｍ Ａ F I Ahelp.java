/* Coded Byá³ââððððððï¿½ÒÒâï¼­ ï¼¡ F I ï¼¡ð±ð°ð¤ .

Licensed under the  GPL-3.0 License;
you may not use this file except in compliance with the License.

Whats bot - á³âá³ââððððððï¿½ÒÒâï¼­ ï¼¡ F I ï¼¡ð±ð°ð¤

*/

function successfullMessage(msg) {
    return "ð±ð° *á³ââððððððï¿½ÒÒâï¼­ ï¼¡ F I ï¼¡ð±ð°ð¤*:  ```" + msg + "```"
}
function errorMessage(msg) {
    return "ð¥´ *á³ââððððððï¿½ÒÒâï¼­ ï¼¡ F I ï¼¡ð±ð°ð¤*:  ```" + msg + "```"
}
function infoMessage(msg) {
    return "ð² **: á³ââððððððï¿½ÒÒâï¼­ ï¼¡ F I ï¼¡ð±ð°ð¤ ```" + msg + "```"
}


module.exports = {
    successfullMessage,
    errorMessage,
    infoMessage
}
