# Tarea1-Elementos

Este proyecto es una aplicación Android que sirve como un catálogo interactivo para demostrar el uso de varios componentes de la interfaz de usuario (UI) en Android, utilizando **Kotlin** y **Fragments**. La aplicación está diseñada para ser una herramienta educativa que muestra ejemplos visuales y funcionales de los elementos más comunes.

## 🌟 Características

* **1 Activity principal:** `MainActivity` gestiona la navegación entre los diferentes Fragments.
* **5 Fragments:** Cada uno dedicado a una categoría de elementos de UI.
* **Navegación:** Un `BottomNavigationView` intuitivo para cambiar fácilmente entre las diferentes secciones.
* **Ejemplos interactivos:** Cada fragmento incluye una demostración práctica donde el usuario puede interactuar con los elementos.

---

## 🏗️ Estructura del Proyecto

El proyecto está organizado en una estructura clara para facilitar la comprensión.

### `MainActivity`

* **`MainActivity.kt`**: La actividad principal de la aplicación. Se encarga de la lógica de navegación, gestionando las transacciones de los fragments basándose en la selección del menú inferior.
* **`activity_main.xml`**: El layout principal que contiene el contenedor (`FrameLayout`) para los fragments y el `BottomNavigationView`.
* **`bottom_nav_menu.xml`**: El archivo de menú que define los 5 íconos y títulos para la barra de navegación.

---

## 🧩 Fragmentos Detallados

A continuación, se detalla cada fragmento y los archivos que lo componen, con una breve descripción de su propósito.

### 1. Text Fields (EditText)
* **Descripción**: Muestra diferentes tipos de campos de texto (`EditText`) para la entrada de datos, como texto simple, contraseñas, correos electrónicos y números. Incluye una demostración donde el usuario puede ingresar texto y ver un `Toast` con el resultado.
* **Archivos**:
    * `TextFieldsFragment.kt`
    * `fragment_textfields.xml`

### 2. Botones (Button & ImageButton)
* **Descripción**: Explica y demuestra los tipos de botones más comunes. Muestra un `Button` estándar con texto y un `ImageButton` que usa un ícono. Al hacer clic en cualquiera de ellos, aparece un mensaje `Toast`.
* **Archivos**:
    * `ButtonsFragment.kt`
    * `fragment_buttons.xml`
    * `ic_baseline_favorite_24.xml` (ícono del `ImageButton`)

### 3. Elementos de Selección (CheckBox, RadioButton, Switch)
* **Descripción**: Demuestra los elementos de UI utilizados para selecciones. Incluye un `CheckBox` para opciones múltiples, un `RadioGroup` con `RadioButton`s para selección única y un `Switch` para un estado binario (on/off).
* **Archivos**:
    * `SelectionElementsFragment.kt`
    * `fragment_selection_elements.xml`
    * `ic_baseline_check_box_24.xml` (ícono de navegación)

### 4. Listas (RecyclerView)
* **Descripción**: Muestra cómo utilizar un `RecyclerView` para crear listas eficientes y desplazables. Se incluye un `Adapter` y un modelo de datos para poblar la lista con información de ejemplo.
* **Archivos**:
    * `ListsFragment.kt`
    * `fragment_lists.xml`
    * `list_item.xml` (layout de cada elemento de la lista)
    * `ListAdapter.kt` (adaptador del `RecyclerView`)
    * `ListItem.kt` (modelo de datos)

### 5. Elementos de Información (TextView, ImageView, ProgressBar)
* **Descripción**: Presenta elementos de UI utilizados para mostrar información al usuario. Incluye un `TextView` para texto, un `ImageView` para imágenes estáticas y un `ProgressBar` horizontal con una demostración interactiva que simula una carga.
* **Archivos**:
    * `InformationFragment.kt`
    * `fragment_information.xml`
    * `ic_baseline_android_24.xml` (ícono del `ImageView`)
