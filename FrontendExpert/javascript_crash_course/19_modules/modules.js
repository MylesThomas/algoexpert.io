const shouldSayFrontend = true;

if (shouldSayFrontend) {
    //const importedObj = await import ('./helpers.js');
    const { frontendExpert } = await import ('./helpers.js');
    frontendExpert();
}