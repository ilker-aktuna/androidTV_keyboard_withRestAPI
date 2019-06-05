metadata {
	definition (name: "Android TV Device", namespace: "ilkera", author: "ilker Aktuna") {
		capability "Presence Sensor"
		capability "Actuator"
		capability "Sensor"
		capability "Switch"
        	capability "refresh"
        	capability "polling"

		attribute "ip", "string"
		attribute "port", "string"
        	attribute "state", "string"
		command "up"
		command "down"
		command "update"
command "youtube"
command "puhu"
command "plex"
command "power"
command "sleep"
command "home"
command "back"
command "search"
command "upx"
command "downx"
command "left"
command "right"
command "center"
command "volumeup"
command "volumedown"
command "rewind"
command "ff"
command "playpause"
command "previous"
command "next"
command "getstatus"
command "refresh"

	}
    preferences {
    	section {
        input title: "", description: "Android TV device", displayDuringSetup: true, type: "paragraph", element: "paragraph"
        input("name", "string", title:"Name", description: "Name", required: true, displayDuringSetup: true)
        input("ip", "string", title:"LAN IP address", description: "LAN IP address", required: true, displayDuringSetup: true)
        input("port", "string", title:"LAN Port", description: "LAN Port", required: true, displayDuringSetup: true)
        }
	}
	simulator {
		status "present": "presence: present"
		status "not present": "presence: not present"
	}

	tiles(scale: 2) {
  		standardTile("presence", "device.presence", width: 3, height: 1, canChangeIcon: true,  backgroundColor:"#ffffff") {
			state ("present", label: "UP", icon: "st.Electronics.electronics15", backgroundColor:"#00aa33")
			state ("not present", label: "DOWN", icon: "st.Electronics.electronics15", backgroundColor:"#ffffff")
		}
        standardTile("state", "device.state", width: 6, height: 2, canChangeIcon: true,  backgroundColor:"#ffffff") {
			state ("playing", label: "playing", icon: "st.Electronics.electronics15", backgroundColor:"#00aa33")
			state ("off", label: "off", icon: "st.Electronics.electronics15", backgroundColor:"#ffffff")
			state ("stopped", label: "stopped", icon: "st.Electronics.electronics15", backgroundColor:"#FFA500")
			state ("standby", label: "standby", icon: "st.Electronics.electronics15", backgroundColor:"#aa3333")
		}

standardTile("youtube", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "youtube", action: "youtube", icon: "https://github.com/ilker-aktuna/androidTV_keyboard_withRestAPI/raw/master/icons/youtube.png" }
standardTile("home", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "home", action: "home", icon: "http://cdn.device-icons.smartthings.com/Home/home2-icn@2x.png" }
standardTile("puhu", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "puhu", action: "puhu", icon: "https://github.com/ilker-aktuna/androidTV_keyboard_withRestAPI/raw/master/icons/puhu.png" }
standardTile("plex", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "plex", action: "plex", icon: "https://github.com/ilker-aktuna/androidTV_keyboard_withRestAPI/raw/master/icons/plex.png" }
standardTile("power", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "power", action: "power", icon: "https://github.com/ilker-aktuna/androidTV_keyboard_withRestAPI/raw/master/icons/power.png" }
standardTile("sleep", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "sleep", action: "sleep", icon: "" }
standardTile("back", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "back", action: "back", icon: "https://github.com/ilker-aktuna/androidTV_keyboard_withRestAPI/raw/master/icons/back.png" }
standardTile("search", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "search", action: "search", icon: "https://github.com/ilker-aktuna/androidTV_keyboard_withRestAPI/raw/master/icons/search.png" }
 /*
standardTile("upx", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "upx", action: "upx", icon: "" }
standardTile("downx", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "downx", action: "downx", icon: "" }
standardTile("left", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "left", action: "left", icon: "" }
standardTile("right", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "right", action: "right", icon: "" }
standardTile("center", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "center", action: "center", icon: "" }
 */
standardTile("volumeup", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "volume", action: "volumeup", icon: "http://cdn.device-icons.smartthings.com/thermostat/thermostat-up@2x.png" }
standardTile("volumedown", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "volume", action: "volumedown", icon: "http://cdn.device-icons.smartthings.com/thermostat/thermostat-down@2x.png" }
standardTile("rewind", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "REW", action: "rewind", icon:"st.sonos.previous-btn" }
standardTile("ff", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "FF", action: "ff", icon:"st.sonos.next-btn"}
standardTile("playpause", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "", action: "playpause", icon:"st.sonos.play-btn" }
standardTile("previous", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "", action: "previous", icon:"st.sonos.previous-btn" }
standardTile("next", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") { 
 state "", label: "", action: "next", icon:"st.sonos.next-btn" }
 
		standardTile("left", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") {
			state "default", label: "", action: "left", icon: "http://cdn.device-icons.smartthings.com/thermostat/thermostat-left@2x.png", defaultState: true
		}

		standardTile("right", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") {
			state "default", label: "", action: "right", icon: "http://cdn.device-icons.smartthings.com/thermostat/thermostat-right@2x.png", defaultState: true
		}

		standardTile("up", "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
			state "default", label: "", action: "upx", icon: "http://cdn.device-icons.smartthings.com/thermostat/thermostat-up@2x.png", defaultState: true
		}

		standardTile("down", "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
			state "default", label: "", action: "downx", icon: "http://cdn.device-icons.smartthings.com/thermostat/thermostat-down@2x.png", defaultState: true
		}

		standardTile("center", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") {
			state "default", label: "OK", action: "center", icon: "", defaultState: true
		}
        standardTile("blank", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") {
        	state "default", label: "", action: "", icon: "", backgroundColor: "#FFFFFF", defaultState: true
        }

		standardTile( "refresh", "device.power", inactiveLabel: false, decoration: "flat", width: 1, height: 1) {
			state "default", label:'', action:"refresh.refresh", icon:"st.secondary.refresh"
		}
        
		main "state"
		//details (["presence", "state", "youtube","homex","puhu","plex","power","sleep","wake","home","back","search", "upx","downx","left","right","center","volumeup","volumedown","rewind","ff","playpause","previous","next","refresh"])
        details (["state", "presence", "refresh", "power","home","puhu","plex","youtube","sleep","back","search", "blank", "up", "blank", "blank", "volumeup", "blank", "left", "center", "right", "rewind", "playpause", "ff", "blank", "down", "blank", "previous", "volumedown", "next"])
	}
}

def installed() {
    initialize()
}

def updated() {
    initialize()
}

def poll(){
    refresh()
}

def initialize() {
	state.statx="off"
	state.statxold="off"
    //refresh()
    unschedule()
	runEvery1Minute(refresh)
	runIn(1, refresh)
}

def parse(String description) {
    def map = description
    	if (description instanceof String)  {
        map = stringToMap(description)
        def body = new String(map?.body.decodeBase64())
        def bodymap = stringToMap(body)
        def stattemp = bodymap?.status
        state.statxara=stattemp
        //log.debug body
	}
     
}

def refresh() {
    //state.statxold=state.statx
    state.statxara="none"
    def host = ip 
    def port = port
    def hosthex = convertIPtoHex(host)
    def porthex = convertPortToHex(port)
    device.deviceNetworkId = "$hosthex:$porthex"
    getstatus()
}

def startTimer(seconds) {   
    def now = new Date()
	def runTime = new Date(now.getTime() + (seconds * 1000))
	runOnce(runTime, setstatus)
}

def setstatus() {
	if (state.statxara != "none") {
        state.statxold=state.statx
        state.statx=state.statxara
	} else {
        state.statxold=state.statx
		state.statx="off"
	}
    if (state.statx != state.statxold) {
    	//log.debug "old state: ${state.statxold}"
        //log.debug "new state: ${state.statx}"
    	state.statxold=state.statx
    	sendEvent(name: "state", value: state.statx, isStateChange: true)
        if ( state.statx != "off" ) {
    		sendEvent(name: "presence", value: "present")
    	}
    	else {
    		sendEvent(name: "presence", value: "not present")
    	}
    }
}

def up(state) {
def status = state
    sendEvent(name: "state", value: status, isStateChange: true)
    sendEvent(name: "presence", value: "present")
}

def down(state) {
def status = state
    sendEvent(name: "state", value: status, isStateChange: true)
	sendEvent(name: "presence", value: "not present")
}

def update(state) {
def status = state
    sendEvent(name: "state", value: status, isStateChange: true)
    sendEvent(name: "presence", value: "present")
}

private String convertIPtoHex(ipAddress) { 
    String hex = ipAddress.tokenize( '.' ).collect {  String.format( '%02x', it.toInteger() ) }.join()
    return hex
}

private String convertPortToHex(port) {
	String hexport = port.toString().format( '%04x', port.toInteger() )
    return hexport
}

def getstatus() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/status"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}

def youtube() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/youtube"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def home() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/home"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def puhu() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/puhu"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def plex() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/plex"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def power() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/power"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def sleep() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/sleep"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}

def back() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/back"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def search() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/search"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def upx() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/up"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def downx() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/down"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def left() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/left"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def right() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/right"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def center() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/center"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def volumeup() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/volumeup"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def volumedown() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/volumedown"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def rewind() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/rewind"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def ff() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/ff"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def playpause() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/playpause"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def previous() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/previous"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}
def next() {
    def hosthex = convertIPtoHex(ip).toUpperCase()
    def porthex = convertPortToHex(port).toUpperCase() 
    def path = "/next"
    def headers = [:] 
    headers.put("HOST", "$ip:$port")
    def method = "GET"
    
    try {
    def hubAction = new physicalgraph.device.HubAction(
        method: method,
        path: path,
        headers: headers
        )
        sendHubCommand(hubAction)
    }
    catch (Exception e) {
        log.debug "Hit Exception $e on $hubAction"
    }
    state.statxara="none"
    startTimer(2)
}

