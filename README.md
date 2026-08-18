<div align="center">

  <img src="https://raw.githubusercontent.com/DrakesCraft-Labs/ChestTerminal-drake/main/banner.svg" alt="ChestTerminal-drake Banner" width="920" />

# 🗄️ ChestTerminal-Drake

**Sistema de Indexación Masiva de Cofres, Búsqueda de Ítems e Interfaz Digital para Slimefun4**

<p>
  <a href="https://github.com/DrakesCraft-Labs/ChestTerminal-drake"><img src="https://img.shields.io/badge/GitHub-ChestTerminal--Drake-181717?style=for-the-badge&logo=github" alt="GitHub"/></a>
  <img src="https://img.shields.io/badge/Java-21_FFM_Panama-F89820?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21 FFM"/>
  <img src="https://img.shields.io/badge/Rust-FFM_Accelerated-FF4500?style=for-the-badge&logo=rust&logoColor=white" alt="Rust Native"/>
  <img src="https://img.shields.io/badge/Paper-1.21.11-06B6D4?style=for-the-badge&logo=minecraft&logoColor=white" alt="Paper 1.21.11"/>
</p>

</div>

> ### 🏰 ¡Únete a la Comunidad Oficial de DrakesCraft!
> 
> * 🎮 **IP del Servidor**: `play.drakescraft.net` *(Java 1.21.11 & Bedrock)*
> * 💬 **Discord Oficial**: [discord.gg/drakescraft](https://discord.gg/rR7FbfCt9Y)
> * 🌐 **Web & Guía**: [drakescraft.net](https://drakescraft.net) — 🛒 **Tienda**: [tienda.drakescraft.net](https://tienda.drakescraft.net)
> 
> *¡Juega con este addon y más de 80 expansiones optimizadas en vivo en nuestra network de supervivencia técnica!*

---

---

## 🗄️ ¿Qué es ChestTerminal-Drake?

`ChestTerminal-drake` conecta múltiples cofres normales, cofres dobles y barriles dentro de una zona en una interfaz centralizada de búsqueda y extracción instantánea.

### 🧰 Funcionalidades Clave
- **Búsqueda Instantánea**: Busca ítems por nombre, lore o ID de Slimefun a través de cientos de cofres conectados.
- **Exportación / Importación Automática**: Extrae o almacena ítems con un solo clic o mediante tolvas.
- **Aceleración Nativa en Rust (RustNativeBridge)**: Búsqueda indexada en memoria RAM nativa en nanosegundos sin pausas de Garbage Collector.

---

## 🛠️ Compilación

```bash
mvn clean package
```

---

<div align="center">

**DrakesCraft Labs** · Mantenido por [**JackStar6677-1**](https://github.com/JackStar6677-1)

</div>

## Qué añade al juego

Addon de Slimefun con contenido propio: máquinas, objetos y recetas nuevas.
Registra alrededor de **9 objetos** en la guía de Slimefun.

Todo se fabrica y se investiga desde la guía normal (`/sf guide`), como cualquier otro contenido
de Slimefun: no hace falta ningún comando especial para empezar.

## Compatibilidad

| | |
|---|---|
| Servidor | Paper / Purpur **1.21.11** |
| Java | **21** |
| Requiere | [Slimefun4-Drake](https://github.com/DrakesCraft-Labs/Slimefun4-Drake) |
| Lado | Solo servidor — quien juega no instala nada |
| Versión | ${version} |

## Instalación

1. Descarga el `.jar` de la última versión.
2. Déjalo en la carpeta `plugins/` del servidor, junto a Slimefun.
3. Reinicia el servidor. Los objetos aparecen solos en la guía.

> Este addon está portado al fork de Slimefun de DrakesCraft. Con el Slimefun original puede no
> cargar, porque cambia el espacio de nombres de las clases.

## Créditos
- TheBusyBiscuit

Port y mantenimiento por **DrakesCraft Labs**. La autoría original es de quien figura arriba; el detalle está en [docs/UPSTREAM_ATTRIBUTION.md](https://raw.githubusercontent.com/DrakesCraft-Labs/ChestTerminal-drake/main/docs/UPSTREAM_ATTRIBUTION.md).

Licencia **MIT**.
