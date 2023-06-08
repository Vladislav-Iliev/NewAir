package com.vladislaviliev.newair.data

import com.google.android.gms.maps.model.LatLng

data class Sensor(val type: SensorType, val latLng: LatLng, val measure: Double)